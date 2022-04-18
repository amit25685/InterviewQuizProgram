package com.comp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataTransformationV2 {
	
	
	public static void main(String aa[]) throws IOException{
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy hh:mm A z");
		String stringDate= DateFor.format(date);
		System.out.println(stringDate);
			}

}
