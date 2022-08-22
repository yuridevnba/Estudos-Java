package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///////////////////// UTILIZANDO O PRINTF/////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/*
* String produto1="computador"; String produto2="Office desk";
* 
* int ano= 30; int code= 5290; char gender ='F';
* 
* double preco1=2100; double preco2=650.50; double measure= 53.6398;
* 
* 
* 
* System.out.println("Produtos:");
* System.out.printf("%s, tem o preço de R$ %.2f %n",produto1,preco1);
* System.out.printf("%s , tem o preço de R$ %.2f %n",produto2,preco2);
* System.out.println("Record:");
* System.out.printf("%d anos, code %d e descrição: %s%n",ano,code,gender);
* 
* System.out.println("\n teste com ponto e vírgural");
* System.out.printf("%f",measure); Locale.setDefault(Locale.US);
* System.out.printf("Us decimal point: %.4f",measure);
*/
//////////////////// CONVERTENDO O VALOR DO RESULTADO PARA
//////////////////// DOUBLE///////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
/*
* int a,b; double resultado;
* 
* a= 5; b = 2;
* 
* resultado= (double)a/b; // convertendo o valor do resultado para double.
* 
* System.out.println(resultado);
*/

// Scanner teclado = new Scanner(System.in);

/*
* String x; x=teclado.next(); // nextInt(), nextDouble();,sc.next().charAt(0);
* System.out.println("Voce digitou: "+x);
* 
* double y; y= teclado.nextDouble(); System.out.println("Voce digitou: "+ y);
* // se eu colocar com . vai dar erro,pois o teclado está na escrita português.
* System.out.printf("Voce digitou: %.2f%n",y); // imprimir com a vírgula.
* 
* char z; z=teclado.next().charAt(0); System.out.println("voce digitou: "+ z);
*/

/*
* String x; int y; double z;
* 
* x=teclado.next(); y= teclado.nextInt(); z=teclado.nextDouble();
* System.out.println("Dados digitados"); System.out.println(x);
* System.out.println(y); System.out.println(z);
*/
/*
* String s1,s2,s3;
* 
* s1 = teclado.nextLine(); // para ler oque foi digitado na linha.
* s2=teclado.nextLine(); s3=teclado.nextLine();
* 
* System.out.println("DADOS DIGITADOS:"); System.out.println(s1);
* System.out.println(s2); System.out.println(s3);
*/

////////////////////////// APREDENDO A USAR O
////////////////////////// NEXTLINE()//////////////////////////
//////////////////////////////////////////////////////////////////////////////////

Scanner teclado=new Scanner(System.in);
int x; String s1, s2, s3;
System.out.println("escreva um número");
x = teclado.nextInt(); // usando o nextInt,antes do nextLine, ele vai receber a quebra de linha. 
teclado.nextLine(); // nextLine extra só para receber a quebra de linha. 
System.out.println("escreva algo");
s1 = teclado.nextLine(); 
s2 = teclado.nextLine(); 
System.out.println("escreva algo");
s3 = teclado.nextLine();

System.out.println(x); System.out.println(s1); System.out.println(s2);
System.out.println(s3);


///////////////// USANDO RAIZ QUADRADA, POTENCIAÇÃO, VALOR
///////////////// ABSOLUTO/////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////

/*
* double x=25.0; double y=2.0; double z =-5.0; double A,B,C,D,E,F;
* 
* A=Math.sqrt(x); // raiz quadrada B= Math.pow(x,y); // potência C=Math.abs(z);
* // valor absoluto D= Math.pow(x,10);
* 
* 
* 
* System.out.println("raiz quadrada de "+ x +" = "+A);
* System.out.println(x+" elevado a "+y+" = "+B);
* System.out.println("Valor absoluto de "+z+" = "+C);
* System.out.println(x+" elevado a "+5+" = "+D);
*/

////////////////// INCLUINDO FUNÇÕES EM EXPRESSÕES MAIORES////////////////
////////////////////////////////////////////////////////////////////////

/*
* double delta,x1,x2; double b,a,c; delta= Math.pow(b,2.0)-4*a*c; // função
* para encontrar o delta.
* 
* x1=(-b+ Math.sqrt(delta))/(2.0*a); x2=(-b- Math.sqrt(delta))/(2.0*a);
*/

////////////////// IF/ ELSE(BÁSICO SÓ PARA
////////////////// LEMBRAR)///////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
/*
* int hora; System.out.println("Quantas horas?"); hora = teclado.nextInt();
* 
* if (hora < 12) /// se tiver apenas um comando o abre fecha chave é opcional.
* System.out.println("bom dia");
* 
* else { if (hora < 18) { System.out.println("boa tarde"); } else {
* System.out.println("boa noite");
* 
* 
* }
*/
/////////////////// OPERADORES SE ATRIBUIÇÃO CUMULATIVA//////////////////////
/////////////////////////////////////////////////////////////////////////////
/*
* int a=2; int b=7; a+=b; // a=a+b; System.out.println(a);
*/
///////////////////// ESTRUTURA SWITCH-CASE///////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
/////////// utilizando if/else//////////////////////
/*
* String dia; System.out.println("escreva uma dia da semana"); int
* x=teclado.nextInt();
* 
* if(x==1) { dia="domingo"; } else if(x==2) { dia ="segunda"; } else if(x==3) {
* dia="terça"; } else { dia=" valor invalido"; /// teria que usar 8 condições }
* System.out.println("Dia da semana: "+ dia); teclado.close(); // fechar o
* scanner que estiver aberto.
*/
//////////////////////// UTILIZANDO O SWITCH-CASE//////////////////////////
//////////////////////////////////////////////////////////////////////////

/*
* Scanner sc = new Scanner(System.in);
* System.out.println("escreva um número que indique o dia na semana"); int x=
* sc.nextInt(); String dia;
* 
* switch(x) { // avaliar o valor x. case 1: dia = "domingo"; break; case 2: dia
* = "segunda"; break; case 3: dia="terça"; break; case 4: dia="quarta"; break;
* case 5: dia="quinta"; break; case 6: dia="sexta"; break; case 7:
* dia="sabádo"; break; default: dia ="valor invalido"; break; }
* System.out.println("Dia da semana: "+dia);
*/
///////////////////////////// Expressão condicional
///////////////////////////// ternária///////////////////////
///////////////////////////////////////////////////////////////////////////////////

///// opcional ao if else, caso deseje decidir um valor com base em uma
///// condição.

/*
* double preco = 34.5; double desconto; if (preco < 20.0) { desconto = preco *
* 0.1; } else { desconto = preco * 0.05; } System.out.println(desconto); double
* preco2 = 34.5; double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 *
* 0.05; System.out.println(desconto2);
*/

//////////// Escopo e inicialização/////////////////////
////////////////////////////////////////////////////////////
/*
* double price = 400.00; //double desconto=0; double desconto; if(price<200.00)
* { desconto = price*0.1; } else { desconto=0; } System.out.println(desconto);
* // está fora do escopo do if, onde a variável foi declarada.
* 
*/

//////////////// Debug no Eclipse/////////////////////
/////////////////////////////////////////////////////////

/*
* Locale.setDefault(Locale.US);
* 
* Scanner sc = new Scanner(System.in);
* 
* System.out.println("largura"); double largura = sc.nextDouble();
* System.out.println("comprimento"); double comprimento = sc.nextDouble();
* System.out.println("metroQuadrado"); double metroQuadrado = sc.nextDouble();
* 
* double area = largura * comprimento; double preco = area * metroQuadrado;
* 
* System.out.printf("AREA = %.2f%n", area); System.out.printf("PRECO = %.2f%n",
* preco); sc.close();
*/

////////////////////// WHILE//////////////////////////////
////////////////////////////////////////////////////////////
//// instruções: usar quando n se saber a quantitade de repetições que será
////////////////////// realizada

/*
* Scanner sc= new Scanner(System.in);
* 
* int x=sc.nextInt(); int soma=0; // elemento neutro da adição. while(x!=0) {
* soma+=x;
* 
* x=sc.nextInt(); }
* 
* System.out.println("a soma de todos os números digitados = "+soma);
*/

///////////////////// EXERCÍCIO WHILE//////////////////////////////////
/////////////////////////////////////////////////////////////////////////

// Um Posto de combustíveis deseja determinar qual de seus produtos tem a
// preferência de seus clientes. Escreva
// um algoritmo para ler o tipo de combustível abastecido (codificado da
// seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
// deve ser solicitado um novo código (até
// que seja válido). O programa será encerrado quando o código informado for o
// número 4. Deve ser escrito a
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
// tipo de combustível, conforme
// exemplo

/*Scanner tc = new Scanner(System.in);
int alcool = 0, Gasolina = 0, Diesel = 0;
int pref;

do {
System.out.println("faça a sua escolha de combustível que vc abasteceu");
System.out.println("1. Gasolina \n 2. Àlcool \n 3.Diesel \n 4.Fim");
pref = tc.nextInt();
} while (pref > 4 || pref < 1);
System.out.println("você pode digitar,mais de uma opção!");

while (pref != 4 && pref < 4 && pref > 0) {
if (pref == 2) {
	alcool++;
} else if (pref == 1) {
	Gasolina++;
} else if (pref == 3) {
	Diesel++;
}
pref = tc.nextInt();
}
if (pref == 4) {
System.out.println("MUITO OBRIGADO");
System.out.println("Alcool: " + alcool);
System.out.println("Gasolina: " + Gasolina);
System.out.println("Diesel: " + Diesel);

tc.close();

}*/

////////////////////////////////EXERCICIO FOR////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////


//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
//exemplo
/*Scanner tc= new Scanner(System.in);
int x=0;
System.out.println("digite um número positivo");
x=tc.nextInt();
if(x>0) {
for(int i=1;i<=x;i++) {
	//System.out.print(i+" ");
	//System.out.print(i*i+" ");
	//System.out.print(i*i*i+" ");
	//System.out.println("\n");
	int primeiro= i;
	int segundo= i*i;
	int terceiro= i*i*i;
	
	System.out.printf("%d %d %d%n",primeiro,segundo,terceiro);
	
	}
}*/

/////////////////////////DO WHILE/////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
//////////// EXERCÍCIO PROPOSTO/////////////////////////////////////
//programa ler a temperatura em celsius e mostra em fanhrenhit, perguntar se o usuário deseja repetir (s/n)
// fórmula: F=9c/5+32
/*Locale.setDefault(Locale.US);
Scanner sc= new Scanner(System.in);
char letra;
do {
System.out.print("digite a temperatura em celsius:");
double c=sc.nextDouble();
double F=9.0*c/5.0+32.0;
System.out.printf("Equivalente em Fahrenheit: %.2f%n",F);
System.out.println("quer medir outra temperatura, digite (S/N)");
letra=sc.next().charAt(0);
}while(letra=='s');*/

///////////////////////////////////// OPERADORES BITWISE////////////////////////////
///////////////////////////////////////////////////////////////////////////////////

/*	int n1 = 89;
int n2 = 60;
System.out.println(n1 & n2);
System.out.println(n1 | n2);
System.out.println(n1 ^ n2);

Scanner sc= new Scanner(System.in);
int mask= 0b100000; // 32 de forma binária.
int n= sc.nextInt();
if((n & mask)!=0) {
System.out.println("6 bit is true!");
}
else {
System.out.println("6th bit is false");
}*/

///////////////////////////////////FUNÇÕES PARA STRING////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
/*
String original = "abcde FGHIJ ABC abc DEFG ";
String s01 = original.toLowerCase(); // letras minúsculas
String s02 = original.toUpperCase(); // letras maiúsculas
String s03 = original.trim();        // sem espaço
String s04 = original.substring(2);  // criando uma nova string apartir da terceira letra, cortando as 2 primeiras letras.
String s05 = original.substring(2, 9); // criando uma nova string apartir da terceira letra até a nona letra.
String s06 = original.replace('a', 'x'); // troca
String s07 = original.replace("abc", "xy"); // troca em conjunto
int i = original.indexOf("B"); // primeira ocorrência, conta com os espaços.
int j = original.lastIndexOf("bc");// última ocorrência, conta com os espaços.





System.out.println("Original: -" + original + "-");
System.out.println("toLowerCase: -" + s01 + "-");
System.out.println("toUpperCase: -" + s02 + "-");
System.out.println("trim: -" + s03 + "-");
System.out.println("substring(2): -" + s04 + "-");
System.out.println("substring(2, 9): -" + s05 + "-");
System.out.println("replace('a', 'x'): -" + s06 + "-");
System.out.println("replace('abc', 'xy'): -" + s07 + "-");
System.out.println("Index of 'A': " + i);
System.out.println("Last index of 'bc': " + j); */


///////////////////////OPERAÇÃO SPLIT///////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
/*
String s = "potato apple lemon";
String[] vect = s.split(" "); /// utilizando o espaço em branco como separador.
System.out.println(vect[0]);
System.out.println(vect[1]);
System.out.println(vect[2]);
String word1 = vect[0];
String word2 = vect[1];
String word3 = vect[2]; */


////////////////////////////FUNÇÕES////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

/*Scanner sc = new Scanner(System.in);

/*System.out.println("escolha 3 números");

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a>b && a>c) {
System.out.println(" maior = "+a);
}
else if(b>c) {
System.out.println("maior = "+b);
}

else {
System.out.println("maior = "+c);
}

System.out.println("escolha 3 números");

int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();


int maior=max(x,y,z); // max retorna o aux int comparando a ele, estarei comparando ao auxiliar.
showResult(maior);

}
public static int max(int a, int b, int c) {

int aux;
if(a>b && a>c) {
aux=a;	
}
else if(b>c) {
aux=b;	
}

else {
	aux=c;
}
return aux;
}
public static void showResult(int value) {
System.out.println("maior= "+value);*/
	}

}
