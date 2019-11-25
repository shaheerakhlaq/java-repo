package com.sh3.java.repo.aop.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

/**
 * @author MSA
 * @version 1.0
 */

public class AOPUtil {
	public static <T> Class<T> getClassObject(String className) throws ClassNotFoundException {
		return (Class<T>) Class.forName(className);
	}

	public static <T> String marshal(String className, T object) throws ClassNotFoundException {
		// logger.info("#Start marshal");

		if (object == null) {
			return null;
		}

		Class<T> clazzObject = getClassObject(className);

		String xml = null;
		try {
			StringWriter writer = new StringWriter();

			JAXBContext context = JAXBContext.newInstance(clazzObject);
			JAXBElement<T> jaxbElement = new JAXBElement<T>(new QName(clazzObject.getSimpleName()), clazzObject,
					object);
			// logger.info("#calls createMarshaller()");
			context.createMarshaller().marshal(jaxbElement, writer);

			xml = writer.toString();

			System.out.println(xml);
		} catch (JAXBException ex) {
			// logger.error("BusinessUtil.marshal failed", ex);
			ex.fillInStackTrace();
			throw new RuntimeException("marshal failed");
		}
		return xml;
	}
}