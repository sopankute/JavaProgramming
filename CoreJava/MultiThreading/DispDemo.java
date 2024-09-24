public class DispDemo{
	public static void main(String[] args)
	{
		DisplayAlpha d = new DisplayAlpha();
	
		new Thread(){
			public void run(){
				d.printNos();
			}
		}.start();
	
		new Thread(){
			public void run(){
				d.printAlphaC();
			}
		}.start();
	
		new Thread(){
			public void run(){
				d.printAlphaS();
			}
		}.start();
	}
	
// }
// ouput :
// 1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26
// a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
// A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z