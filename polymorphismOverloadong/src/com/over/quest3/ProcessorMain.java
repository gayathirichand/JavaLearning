package com.over.quest3;

public class ProcessorMain {
	public static void main(String[] args) {
		
		Processor processor = new Processor();
		processor.calculate(0.0);
		processor.calculate(2,3);
		processor.calculate(3.6,2.1);
		processor.calculate(2.1,0);
		processor.calculate(3);
	}
}
