package txtRead;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		/*��Ҫ����Ĳ���*/
		int filterType = 3;						//��������ֵ��1��ʾ�����ˣ�2��ʾ��ͨ���ˣ�3��ʾ�߼�����
		String filePath = "record.txt";			//�����¼���ļ�·�����˴�ʹ�����·����Ҳ����ʹ�þ���·��
		String keyContent = "��Ҫ���";			//�齱�ؼ��֣�����#֮��Ĵ��#��Ҫ���#
		String startTime = "2018-09-05 12:46";	//�齱��ʼʱ��
		String endTime = "2018-11-06 12:48";	//�齱����ʱ��
		int num = 10;							//���������
		
		/*--------*/
		//��ģ�����
		FinalImplement getArrayList = new FinalImplement(filterType, filePath, keyContent, startTime, endTime);			
		/*���صĲ���(������ArrayList)*/
		ArrayList<Entry<String, Integer>> list = getArrayList.getArrayList();

		/*���ʾ��*/
		System.out.println("�����ǻ�������");
		Iterator<Entry<String, Integer>> iterator = list.iterator();
        int i = 0;
		for(Entry<String, Integer> m : list){
			i++;
			
			System.out.println(m.getKey());		//m.getKey()���ǻ���id
            
            if (i == num) {
            	break;
            }
        }
        
	}
}