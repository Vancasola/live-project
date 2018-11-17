package txtRead;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		/*需要传入的参数*/
		int filterType = 3;						//过滤类型值。1表示不过滤，2表示普通过滤，3表示高级过滤
		String filePath = "record.txt";			//聊天记录的文件路径，此处使用相对路径，也可以使用绝对路径
		String keyContent = "我要红包";			//抽奖关键字（两个#之间的词语）
		String startTime = "2018-08-06 12:46:00";	//抽奖开始时间
		String endTime = "2018-11-06 12:48:00";	//抽奖结束时间
		
		/*--------*/
		//按模板调用
		FinalImplement getArrayList = new FinalImplement(filterType, filePath, keyContent, startTime, endTime);			
		/*返回的参数(排序后的ArrayList)*/
		ArrayList<Entry<String, Integer>> list = getArrayList.getArrayList();

		/*输出示例*/
		int num = 5;							//输入获奖人数
		System.out.println("以下是获奖名单：");
		Iterator<Entry<String, Integer>> iterator = list.iterator();
        int i = 0;
		for(Entry<String, Integer> m : list){
			i++;
            System.out.println(m.getKey());		//m.getKey()就是获奖者id
            if (i == num) {
            	break;
            }
        }
        
	}
}