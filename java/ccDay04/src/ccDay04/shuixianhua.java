package ccDay04;

public class shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num = 0;
		
		for(int i = 100; i <= 999; i++) {
			int bai = i/100;
			int shi = i%100/10;
			int ge = i%10;
			if(i == bai*bai*bai+shi*shi*shi+ge*ge*ge) {
				System.out.println(i);
				num++;
			}
		}
		System.out.println("总共有"+num+"个水仙花树");
	
	}

}