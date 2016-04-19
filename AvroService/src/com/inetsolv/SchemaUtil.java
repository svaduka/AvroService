package com.inetsolv;

import org.apache.avro.Schema;

public class SchemaUtil {
	
	/**
	 * This method will convert string into avsc schema
	 * @param avsc file in string file
	 * @return avro.schema 
	 */
	public static Schema convertStringToSchema(final String avscContent){
		Schema avroSchema=new Schema.Parser().parse(avscContent);
		return avroSchema;
	}

}
