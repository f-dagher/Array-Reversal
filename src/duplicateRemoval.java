import java.util.*;

public class duplicateRemoval {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>(); 
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		
		System.out.println(list.toString());
		
		list = remDup(list);
		System.out.println(list.toString());
		
	}
	
	public static ArrayList remDup(ArrayList list) {
		
		ArrayList newList = new ArrayList();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(!newList.contains(list.get(i)))
			{
				newList.add(list.get(i));	
			}			
		}
		
		return newList;
	}

}

//for(int i = 0; i <= list.size(); i++)
//{
//	for(int j = i + 1; j < list.size(); j++)
//	{
//		if (list.get(j) == list.get(i))
//		{
//			list.remove(j);
//			System.out.println("i: " + i + " j: " + j + " list: " + list.toString());
//		}
//	}
//}
