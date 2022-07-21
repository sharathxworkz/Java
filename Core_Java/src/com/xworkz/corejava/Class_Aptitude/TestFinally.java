package com.xworkz.corejava.Class_Aptitude;

	
	public class TestFinally {
	    public static void main (String[] args) {
	        try{
	            try{
	                int i = 5/0;
	                System.out.print("-foo-");
	            } catch (Exception ex) {
	                throw new RuntimeException("-ex-");
	            } finally {
	                System.out.print("-bar-");
	            }
	        } catch (Exception e) {
	           System.out.print("-baz-");
	        } finally {
	           System.out.print("-others-");
	        }
	    }
	}

