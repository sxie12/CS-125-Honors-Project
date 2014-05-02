public class PixelatedText {

	//takes string of regular text and prints pixelated version
	public static void drawPixelatedText(String text, int x, int y, int size) {
		String upperText=text.toUpperCase();
		char character;
		int shift=0;
		for(int i=0;i<text.length();i++) {
			character=upperText.charAt(i);
			drawPixelatedChar(character,x+shift,y,size);
			if(character=='I' || character=='J' || character=='T' || character=='Y' || character=='1' || character=='+' || character=='-')
				shift+=4*size;
			else if(character=='M' || character=='N' || character=='W' || character=='0' || character=='.')
				shift+=6*size;
			else
				shift+=5*size;
		}
	}

	//takes a char of regular text and prints pixelated version
	public static void drawPixelatedChar(char character, int x, int y, int size) {
		int index=-1;
		if(character==' ')
			index=0;
		else if(character>='A' && character<='Z')
			index=character-'A'+1;
		else if(character>='0' && character<='9')
			index=character-'0'+27;
		else if(character=='+')
			index=37;
		else if(character=='-')
			index=38;
		else if(character==',')
			index=39;
		else if(character=='.')
			index=40;
		else if(character==':')
			index=41;
		else if(character=='!')
			index=42;
		drawPixelatedChar(toBooleanArray(index),x,y,size);
	}

	public static boolean[][] toBooleanArray(int index) {
		boolean[][][] array={
				//space
				{	{false,false,false,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false}},
				//A
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false}},
				//B
				{	{true,true,true,false,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false}},
				//C
				{	{true,true,true,true,false},
					{true,false,false,false,false},
					{true,false,false,false,false},
					{true,false,false,false,false},
					{true,true,true,true,false}},
				//D
				{	{true,true,true,false,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,true,true,false,false}},
				//E
				{	{true,true,true,true,false},
					{true,false,false,false,false},
					{true,true,true,false,false},
					{true,false,false,false,false},
					{true,true,true,true,false}},
				//F
				{	{true,true,true,true,false},
					{true,false,false,false,false},
					{true,true,true,false,false},
					{true,false,false,false,false},
					{true,false,false,false,false}},
				//G
				{	{true,true,true,true,false},
					{true,false,false,false,false},
					{true,false,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false}},
				//H
				{	{true,false,false,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false}},
				//I
				{	{true,true,true,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{true,true,true,false,false}},
				//J
				{	{true,true,true,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{true,true,false,false,false}},
				//K
				{	{true,false,false,true,false},
					{true,false,false,true,false},
					{true,true,true,false,false},
					{true,false,false,true,false},
					{true,false,false,true,false}},
				//L
				{	{true,false,false,false,false},
					{true,false,false,false,false},
					{true,false,false,false,false},
					{true,false,false,false,false},
					{true,true,true,true,false}},
				//M
				{	{true,false,false,false,true},
					{true,true,false,true,true},
					{true,false,true,false,true},
					{true,false,false,false,true},
					{true,false,false,false,true}},
				//N
				{	{true,false,false,false,true},
					{true,true,false,false,true},
					{true,false,true,false,true},
					{true,false,false,true,true},
					{true,false,false,false,true}},
				//O
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false}},
				//P
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{true,false,false,false,false},
					{true,false,false,false,false}},
				//Q
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,true,true,false},
					{true,true,true,true,false}},
				//R
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{true,false,true,false,false},
					{true,false,false,true,false}},
				//S
				{	{true,true,true,true,false},
					{true,false,false,false,false},
					{true,true,true,true,false},
					{false,false,false,true,false},
					{true,true,true,true,false}},
				//T
				{	{true,true,true,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false}},
				//U
				{	{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false}},
				//V
				{	{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{true,false,false,true,false},
					{false,true,true,false,false}},
				//W
				{	{true,false,false,false,true},
					{true,false,false,false,true},
					{true,false,false,false,true},
					{true,false,true,false,true},
					{true,true,false,true,true}},
				//X
				{	{true,false,false,true,false},
					{true,false,false,true,false},
					{false,true,true,false,false},
					{true,false,false,true,false},
					{true,false,false,true,false}},
				//Y
				{	{true,false,true,false,false},
					{true,false,true,false,false},
					{true,true,true,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false}},
				//Z
				{	{true,true,true,true,false},
					{false,false,false,true,false},
					{false,true,true,false,false},
					{true,false,false,false,false},
					{true,true,true,true,false}},
				//0
				{	{true,true,true,true,true},
					{true,false,false,true,true},
					{true,false,true,false,true},
					{true,true,false,false,true},
					{true,true,true,true,true}},
				//1
				{	{false,true,false,false,false},
					{true,true,false,false,false},
					{false,true,false,false,false},
					{false,true,false,false,false},
					{true,true,true,false,false}},
				//2
				{	{true,true,true,false,false},
					{false,false,false,true,false},
					{true,true,true,true,false},
					{true,false,false,false,false},
					{true,true,true,true,false}},
				//3
				{	{true,true,true,true,false},
					{false,false,false,true,false},
					{false,true,true,true,false},
					{false,false,false,true,false},
					{true,true,true,true,false}},
				//4
				{	{true,false,false,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{false,false,false,true,false},
					{false,false,false,true,false}},
				//5
				{	{true,true,true,true,false},
					{true,false,false,false,false},
					{true,true,true,true,false},
					{false,false,false,true,false},
					{true,true,true,false,false}},
				//6
				{	{false,true,true,true,false},
					{true,false,false,false,false},
					{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false}},
				//7
				{	{true,true,true,true,false},
					{false,false,false,true,false},
					{false,false,false,true,false},
					{false,false,true,false,false},
					{false,false,true,false,false}},
				//8
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false}},
				//9
				{	{true,true,true,true,false},
					{true,false,false,true,false},
					{true,true,true,true,false},
					{false,false,false,true,false},
					{true,true,true,false,false}},
				//+
				{	{false,false,false,false,false},
					{false,true,false,false,false},
					{true,true,true,false,false},
					{false,true,false,false,false},
					{false,false,false,false,false}},
				//-
				{	{false,false,false,false,false},
					{false,false,false,false,false},
					{true,true,true,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false}},
				//,
				{	{false,false,false,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false},
					{true,true,false,false,false},
					{false,true,false,false,false}},
				//.
				{	{false,false,false,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false},
					{false,false,false,false,false},
					{true,false,false,false,false}},
				//:
				{	{false,false,false,false,false},
					{true,false,false,false,false},
					{false,false,false,false,false},
					{true,false,false,false,false},
					{false,false,false,false,false}},
				//!
				{	{true,false,false,false,false},
					{true,false,false,false,false},
					{true,false,false,false,false},
					{false,false,false,false,false},
					{true,false,false,false,false}}
			};
		return array[index];
	}

	public static void drawPixelatedChar(boolean[][] array, int x, int y, int size) {
		Zen.setColor(0,0,0);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++)
				if(array[i][j])
					Zen.fillRect(x+j*size,y+i*size,size,size);
		}
	}

}