//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Riley Zhu

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for(int r = 0; r < size; r++) {
    		for(int c = 0; c < size; c++) {
    			m[r][c] = "" + str.charAt(r*size + c);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for(int r = 0 ; r < m.length; r++) {
    		for(int c = 0; c < m[r].length; c++) {
    			if(checkRight(word, r, c)) { return true; }
    			if(checkLeft(word, r, c)) { return true; }
    			if(checkUp(word, r, c)) { return true; }
    			if(checkDown(word, r, c)) { return true; }
    			if(checkDiagUpRight(word, r, c)) { return true; }
    			if(checkDiagUpLeft(word, r, c)) { return true; }
    			if(checkDiagDownRight(word, r, c)) { return true; }
    			if(checkDiagDownLeft(word, r, c)) { return true; }
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
	{
		if(m.length - c < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r][c+i];
		}		
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if(c + 1 < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r][c-i];
		}		
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if(r + 1 < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r-i][c];
		}		
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
    {
		if(m.length - r < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r+i][c];
		}	
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if(r + 1 < w.length()) {
			return false;
		}
		if(m.length - c < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r-i][c+i];
		}	
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if(r + 1 < w.length()) {
			return false;
		}
		if(c + 1 < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r-i][c-i];
		}	
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if(m.length - r < w.length()) {
			return false;
		}
		if(c + 1 < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r+i][c-i];
		}	
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if(m.length - r < w.length()) {
			return false;
		}
		if(m.length - c < w.length()) {
			return false;
		}
		
		String check = "";
		for(int i = 0; i < w.length(); i++) {
			check += m[r+i][c+i];
		}	
		if(w.equals(check)) {
			return true;
		}
		return false;
	}

    public String toString()
    {
    	String output = "";
    	for(int r = 0 ; r < m.length; r++) {
    		for(int c = 0 ; c < m[r].length; c++) {
    			output += m[r][c] + " ";
    		}
    		output += "\n";
    	}
 		return output;
    }
}
