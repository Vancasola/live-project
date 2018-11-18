package txtRead;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by Hawk on 2018-11-17.
 */
public class MonteCarlo {
    private static final int MAXN = 1 << 20;
    private int[] x;
    private ArrayList<String> uselessName;

    public MonteCarlo() {
        x = new int[MAXN];
        uselessName = new ArrayList<>();
    }

    public Map<String, Integer> rand(Map<String, Integer> map) {
        x[0] = (int)(Math.random()*100 + 1);  // �������(���������ڲ���)
        /* ��֤m��a���� */
        int size = map.size();
        int m = 20 * size;
        int a = 21;  // a = 4p + 1
        int b = 15;  // b = 2q + 1
       
        int i = 1;
        int weight = 0;
        for (Map.Entry<String, Integer> en : map.entrySet()) {
			//System.out.println(en.getKey() + "=" + en.getValue());
			x[i] = ( a * x[i-1] + b ) % m;
			if (en.getValue() < 0) {			//����Ϊ�գ��޳��齱����
				i++;
				continue;
			} else if (en.getValue() > 0) {		//����ˢ��������Ȩ��
				weight = en.getValue();
				if (weight > 0) {		
					if (!uselessName.contains(en.getKey())) {
						uselessName.add(en.getKey());
				//	System.out.println(en.getKey());
					}
					if (weight > 30) {
						weight = 30;
					}
				}
				x[i] = (int) (x[i] * ((double)(30 - weight) / 30.0));
			}
			map.put(en.getKey(), x[i]);
			//System.out.println(en.getKey() + "=" + en.getValue());
			i++;
		}
		return map;
    }
    
	public ArrayList<String> getUselessName() {
		//if (!newList.isEmpty() && newList != null) {
			System.out.println("�����Ƕ����ˮ������");
			for(String m : uselessName){
				System.out.println(m);	
	        }
		return uselessName;
	}

}
