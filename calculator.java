/**
 * NOTE: READ ALL THE COMMENTS FOR BETTER UNDERSTANDING
 * FOR SUCH PROJECT SUBSCRIBE MY YOUTUBE CHANNEL : "CODEPROGRAMM"
 * AVAILABLE ON INSTAGRAM : @_who__am__i_
 * YOU CAN WHATSAPP ME :7038372967 
 * 
 */




import java.awt.*;

/*<applet code="calculator" height=300 width=300>
</applet>*/
import java.applet.*;
import java.awt.event.*;
public class calculator extends Applet
{
	Button num_1,num_2,num_3,plus,num_4,num_5,num_6,minus,num_7,num_8,num_9,multiply,num_13,num_0,divide,equal;
    	Panel panel1,panel2;//panel 2 is only for display 
	String s1;         //this will store first number
	Label label1,label2,label3;     //label 1 for 1st number display ,label2 for oprator display //label3 for 1st number and result display


	public void init()    //this will initialise applet	
	{


		setLayout(new BorderLayout());	//No this is not option If you erase this line overall layout will be change	
		panel1=new Panel();//creating instance and reference to Panel i.e panel1
		panel2=new Panel();//creating instance and reference to Panel i.e panel2
		label1= new Label();//creating instance and reference to Label i.e label1
		label2= new Label();//creating instance and reference to Label i.e label2		
		label3= new Label();//creating instance and reference to Label i.e label3
		panel2.setLayout(new GridLayout(2,1));//2 is row number and 1 is column number, this will make panel2's layout to Grid
		panel1.setLayout(new GridLayout(4,4));//4 is row number and 4 is column number, this will make panel1's layout to Grid

		num_1=new Button("1");  //this will put text in num_1 button as "1"
		num_1.setBackground(new Color(105,105,105));//this will set backgrount to num_1 button

		num_2=new Button("2");   //this will put text in num_2 button as "2"
		num_2.setBackground(new Color(105,105,105));//this will set backgrount to num_1 button

		num_3=new Button("3"); //this will put text in num_3 button as "3"
		num_3.setBackground(new Color(105,105,105));

		plus=new Button("+"); 
		plus.setForeground(Color.black);//this will set Foreground to button[Foreground=text]
		plus.setBackground(new Color(255,128,0));

		num_4=new Button("4"); 
		num_4.setBackground(new Color(105,105,105));
		num_5=new Button("5"); 
		num_5.setBackground(new Color(105,105,105));
		num_6=new Button("6"); 
		num_6.setBackground(new Color(105,105,105));
		minus=new Button("-"); 
		minus.setForeground(Color.black);
		minus.setBackground(new Color(255,128,0));
		num_7=new Button("7"); 
		num_7.setBackground(new Color(105,105,105));
		num_8=new Button("8");
		num_8.setBackground(new Color(105,105,105));
		num_9=new Button("9");
		num_9.setBackground(new Color(105,105,105));
		multiply=new Button("x");
		multiply.setForeground(Color.black);
		multiply.setBackground(new Color(255,128,0));
		num_13=new Button("C");

		num_13.setBackground(new Color(64,64,64));
		num_0=new Button("0");
		num_0.setBackground(new Color(105,105,105));
		
		divide=new Button("÷");
		divide.setForeground(Color.black);
		divide.setBackground(new Color(255,128,0));
		equal=new Button("="); 
		equal.setForeground(Color.black);
		equal.setBackground(new Color(255,128,0));
		

                //addion buttons in the panel1
		panel1.add(num_1);panel1.add(num_2);panel1.add(num_3);panel1.add(plus);
		panel1.add(num_4);panel1.add(num_5);panel1.add(num_6);panel1.add(minus);
		panel1.add(num_7);panel1.add(num_8);panel1.add(num_9);panel1.add(multiply);
		panel1.add(num_13);panel1.add(num_0);panel1.add(divide);panel1.add(equal);
                //adding finished

                
		panel1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,14));//setting font to panel1
		panel1.setForeground(Color.white);//setting foreground color to panel1
	
		panel2.add(label1,"North"); //adding label1 in panel1 and setting lable1 position 
		label1.setBackground(Color.BLACK);
		label1.setForeground(Color.WHITE);

		panel2.add(label2,"North");//adding label2 in panel1 and setting lable2 position 
		label2.setBackground(Color.BLACK);
		label2.setForeground(Color.WHITE);

		panel2.add(label3,"North");//adding label3 in panel1 and setting lable3 position 
		label3.setBackground(Color.BLACK);
		label3.setForeground(Color.WHITE);

		panel2.setBackground(Color.BLACK);
		 label3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,24)); //setting font to lable3

		add(panel2,"North");
		add(panel1);

        num_1.addActionListener(new ActionListener(){  //adding actionListener to num1
            public void actionPerformed(ActionEvent event){
		String s = event.getActionCommand();//coping text on num_1,means '1' will be copied to 's'
                s1=label3.getText()+s;//with this we can input multidigit number ex:1234 ,if you erase this line you can input only one digit ex:1 or 2	
		label3.setText(s1);//this will set inputed number on label3
            }
        });









		
 	num_2.addActionListener(new ActionListener(){  //as same as above
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
             //   for such project subcribe my youtube channel CODEPROGRAMM//comment this to remove error

            }
        });
	num_3.addActionListener(new ActionListener(){    //as same as above
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });
	plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();//coping text on plus to 's'
		label2.setText(s); //displaying 's' on label2
		if(label1.getText().equals("")){//this will check :if text on the label is empty then
			label1.setText(s1);//then whatever store in the 's1' will be set to label's text 
		}		
		label3.setText("");//this will clear the label 3 for inputing the next number
            }
        });
	num_4.addActionListener(new ActionListener(){     //same code as for num_1
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });
	num_5.addActionListener(new ActionListener(){//same code as for num_1
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);

               // for such project subcribe my youtube channel CODEPROGRAMM//comment this to remove error
		
            }
        });

	num_6.addActionListener(new ActionListener(){//same code as for num_1
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });

	minus.addActionListener(new ActionListener(){//same code as for plus
            public void actionPerformed(ActionEvent event){
             String s = event.getActionCommand();
		label2.setText(s);
		if(label1.getText().equals("")){
			label1.setText(s1);
		}
	label3.setText("");
            }
        });

num_7.addActionListener(new ActionListener(){//same code as for num_1
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });

num_8.addActionListener(new ActionListener(){//same code as for plus
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });

num_9.addActionListener(new ActionListener(){//same code as for num_1
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });

multiply.addActionListener(new ActionListener(){//same code as for plus
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
		label2.setText(s);
		if(label1.getText().equals("")){
			label1.setText(s1);
		}
label3.setText("");
            }
        });

num_13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
              label3.setText("");//this will simply clear label3 ,where we input data ,NOTE:this will not clear label1 and lable2 
		
            }
        });

num_0.addActionListener(new ActionListener(){//same code as for num_1
            public void actionPerformed(ActionEvent event){
              String s = event.getActionCommand();
                s1=label3.getText()+s;
		label3.setText(s1);
		
            }
        });

divide.addActionListener(new ActionListener(){//same code as for plus
            public void actionPerformed(ActionEvent event){
             String s = event.getActionCommand();
		label2.setText(s);
		if(label1.getText().equals("")){
			label1.setText(s1);
		}
label3.setText("");
            }
        });

equal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){

          	   int num1,num2,res=0;//declaring and initialising three var's 
		num1=Integer.parseInt(label1.getText());//this will convert text store in lable1 that is store in string format to the integer format
                //above code is for type casting
		num2=Integer.parseInt(label3.getText());//num2=12
		//above code is for type casting
		if(label2.getText().equals("+")){//if there is "+" in label2 then
		res=num1+num2;//addion will be perform
		}
			
		
		if(label2.getText().equals("-")){
		res=num1-num2; //this will perform subtraction

		}
	
		if(label2.getText().equals("x")){
		res=num1*num2;//this will perform multiplication

		}
	
		if(label2.getText().equals("÷")){
		res=num1/num2;//this will perform division

		}

		label3.setText("=  "+Integer.toString(res));// And finally this will display result,here is also typecasting performed 
		label2.setText("");//this will clear lable2
		label1.setText("");//this will clear lable1
	
		
            }
        });

	
	}
	

}
//-----------------------***--------------------------
//-- End of program 
//--for such projects subscribe CODEPROGRAMM and follow me on Instagram and github
//-- Make sure You have learned someting new from this project,If you didn't learned anything from this project then you have just waste your time for showing off to your teacher or friends.Doing projects means applying what you have learned .This is only way to test yourself.-Your Friend, Rohit Nandagawali ,if you are having problem to understand just make a call ->7038372967 or message me Whatsapp.
//-- before commenting above lines please read one time 
