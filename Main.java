import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<Double> al = new ArrayList();
    al.add(2.0);
    al.add(7.0);
    al.add(1.0);

    System.out.println(indexOfLargest(al));
  }

  public static double findLargest(ArrayList<Double> a)
  {
    double currentLargest = a.get(0);
    for(int i = 0; i < a.size(); i++)
    {
      if(a.get(i) > currentLargest)
      {
        currentLargest = a.get(i);
      }
    }
    return currentLargest;
  }

  public static int indexOfLargest(ArrayList<Double> a)
  {
    double largest = findLargest(a);
    for(int i = 0; i < a.size(); i++)
    {
      if(a.get(i) == largest)
      {
        return i;
      }
    }
    return -1;
  }

  public static int indexOfInt(ArrayList<Integer> a, int target)
  {
    return a.indexOf(target);
  }
  
  public static boolean hasSameElements(ArrayList<Integer> a, ArrayList<Integer> b)
  {
    //sort them
    Collections.sort(a);
    Collections.sort(b);

    //Compare them
    for(int i = 0; i < a.size(); i++)
    {
      if(a.get(i) != b.get(i));
      {
        return false;
      }
    }
    return true;
  }
  
  public static void removeEvenLength(ArrayList<String> a)
  {
    Iterator<String> iter = a.iterator();
    
    while(iter.hasNext()){
      String str = iter.next();
      //remove even ones
      if(str.length() % 2 == 0)
      {
        iter.remove();
      }
    }
  }


  public static void removeDuplicates(ArrayList<Integer> a)
  {
    int i = 0;
    while(i < a.size())
    {
      if(a.get(i) == a.get(i+1))
      {
        a.remove(i+1);
      }
      else
      {
        i++;
      }
    }
  }
  
  
  //Replace all occurances of character c with * in the string
  //Ex. If s = "happy birithday" and c = 'h', would return "*appy birt*day"
  public static String censor(String s, char c)
  {
    return s.replace(c, '*');

    /*String str = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
        str = str + "*";
      }
      else
      {
        str = str + s.charAt(i);
      }
    }
    return str;
    */
  }
  
  public static void swapPairs(ArrayList<String> a)
  {
    int newSize = a.size();
    if(a.size()%2 == 1)
    {
      newSize--;
    }

    for(int i = 0; i < newSize; i=i+2)
    {
      String item = a.remove(i+1);
      a.add(i,item);
    }
  }

  public static void doubleList(ArrayList<String> a)
  {
    for(int i = 0; i < a.size(); i = i+2)
    {
      String str = a.get(i);
      a.add(i+1, str);
    }
  }

  public static void removeShorterStrings(ArrayList<String> a)
  {
    int newSize = a.size();
    if(a.size()%2 == 1)
    {
      newSize--;
    }

    for(int i = 0; i < newSize; i++)
    {
      if(a.get(i).length() <= a.get(i+1).length())
      {
        a.remove(i);
      }
      else
      {
        a.remove(i+1);
      }
    }
  }
}

  
