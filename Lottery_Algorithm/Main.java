package txtRead;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		/*��Ҫ����Ĳ���*/
		int filterType = 3;						//��������ֵ��1��ʾ�����ˣ�2��ʾ��ͨ���ˣ�3��ʾ�߼�����
		String filePath = "record.txt";			//�����¼���ļ�·�����˴�ʹ�����·����Ҳ����ʹ�þ���·��
		String keyContent = "��Ҫ���";			//�齱�ؼ��֣�����#֮��Ĵ��
		String startTime = "2018-08-06 12:46:00";	//�齱��ʼʱ��
		String endTime = "2018-11-06 12:48:00";	//�齱����ʱ��
		
		/*--------*/
		//��ģ�����
		FinalImplement getArrayList = new FinalImplement(filterType, filePath, keyContent, startTime, endTime);			
		/*���صĲ���(������ArrayList)*/
		ArrayList<Entry<String, Integer>> list = getArrayList.getArrayList();

		/*���ʾ��*/
		int num = 5;							//���������
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