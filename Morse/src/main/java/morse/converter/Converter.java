package morse.converter;

import morse.entities.MorseString;

public class Converter 
{
	
	private String readableInput;
	private MorseString morseInput;
	
	public Converter(String in)
	{
		readableInput = in;
	}
	
	public Converter(MorseString in)
	{
		morseInput = in;
	}
	
	
	public MorseString convertToString()
	{
		MorseString string = new MorseString();
		
		return string;
	}
	
	public String convertToMorse()
	{
		String string = "";
		
		return string;
	}
	
	
}
