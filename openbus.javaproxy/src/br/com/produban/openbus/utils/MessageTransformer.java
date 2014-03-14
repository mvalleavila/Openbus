package br.com.produban.openbus.utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

import br.com.produban.openbus.model.Request;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class MessageTransformer {

	private static Request parseRequest(String input) {
		return new Gson().fromJson(input, Request.class);
	}
	
	public static Request parseByteBufferToRequest(ByteBuffer byteBuffer) {
		Charset charset = Charset.forName("ISO-8859-1");
		CharsetDecoder decoder = charset.newDecoder();
		CharBuffer charBuffer = null;
		try {
			charBuffer = decoder.decode(byteBuffer);
		} catch (CharacterCodingException e) {
			e.printStackTrace();
			return null;
		}

		String json = charBuffer.toString();
		json.trim();
		System.out.println(json);

		Request request = null;
		
		if (!json.isEmpty()) {
			try {
				json = json.substring(json.indexOf("{"), json.lastIndexOf("}") + 1);
				request = MessageTransformer.parseRequest(json);
			} catch (JsonSyntaxException e) {
//				e.printStackTrace();
				System.out.println("------------------------");
				return null;
			} catch (StringIndexOutOfBoundsException e) {
//				e.printStackTrace();
				System.out.println("------------------------");
				return null;
			}

			System.out.println(request);
		}
		return request;
	}

}