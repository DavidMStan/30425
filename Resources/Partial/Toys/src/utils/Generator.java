package utils;

import java.util.UUID;

public class Generator {

	public static String generateGuid() {
		return UUID.randomUUID().toString();
	}
}
