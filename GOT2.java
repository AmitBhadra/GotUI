import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class GOT2{
    static int num,score,clicked=0;
    /**
     * @wbp.parser.entryPoint
     */
    public static void main(String[] args){
        
        int myAnswers[][] = {{0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0}
        };
        String questions[] = {"","Who killed Joffrey?",
                "Father of Jon Snow?",
                "Khaleesi has x dragons \nnow?",
                "Who lives in a pineapple \nunder the sea?",
                };
        
        String options[][]={{},
                {"","Turleys","Margeie","Starks","Targs"},
                {"","Aeggon","Stannis","Robert","Sansa"},
                {"","1","2","3","4"},
                {"", "Stannis", "Sansa","Spongebob", "Your pride"},
                
        };
        
        String hints[]={"","Remember 2 episodes back!",
                "You know nothing!",
                "When you trade a dragon for a white walker, worst trade evar!",
                "LOLOL"};
        int ansCount = 0;
        score= 0;

        
        
        while(++ansCount <= 4){
            System.out.print(ansCount);
        num = ansCount;
        
        
        Display myDisplay = new Display();
        Shell myShell = new Shell(myDisplay);
        myShell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        
        Image image = new Image(myDisplay, "C:/Users/amitasish/Pictures/icon.png");

        int width = image.getBounds().width;
        int height = image.getBounds().height; 
        final Image scaledImage = new Image(myDisplay,image.getImageData().scaledTo((int)(width*0.3),(int)(height*0.3)));
        
        
        myShell.setText("¯\\_(ツ)_/¯");
        myShell.setBounds(20,30,400,300);
        myShell.setLayout(new FormLayout());
        myShell.setImage(image);
        
        
        
        Label qLabel1 = new Label(myShell, SWT.BORDER);
        FormData fd_qLabel1 = new FormData();
        fd_qLabel1.bottom = new FormAttachment(15);
        fd_qLabel1.right = new FormAttachment(0, 144);
        fd_qLabel1.top = new FormAttachment(0);
        fd_qLabel1.left = new FormAttachment(0);
        qLabel1.setLayoutData(fd_qLabel1);
        String str = questions[ansCount];
        //qLabel.setImage(scaledImage);
        qLabel1.setText(str);

        
        
        Label qLabel = new Label(myShell, SWT.BORDER);
        FormData fd_qLabel = new FormData();
        fd_qLabel.bottom = new FormAttachment(0, 132);
        fd_qLabel.right = new FormAttachment(0, 144);
        fd_qLabel.top = new FormAttachment(15);
        fd_qLabel.left = new FormAttachment(0);
        qLabel.setLayoutData(fd_qLabel);
        qLabel.setImage(scaledImage);
        
       
        //qLabel.setBounds(25,35,100,10);
       // qLabel.setSize(10,10);
        

        Button btnNewButton = new Button(myShell, SWT.CENTER);
        FormData fd_btnNewButton = new FormData();
        fd_btnNewButton.top = new FormAttachment(0, 35);
        fd_btnNewButton.left = new FormAttachment(qLabel, 16);
        btnNewButton.setLayoutData(fd_btnNewButton);
        str = options[ansCount][1];
        btnNewButton.setText(str);
        Cursor handCursor = new Cursor(myDisplay,SWT.CURSOR_HAND);
        btnNewButton.setCursor(handCursor);
        
        btnNewButton.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event){
                if(myAnswers[1][num] == 1)
                {
                    score++;
                    clicked = 1;

                }
                myDisplay.dispose();

                
            }
        });
        
        
        
        
            
        Button btnNewButton_1 = new Button(myShell, SWT.CENTER);
        FormData fd_btnNewButton_1 = new FormData();
        fd_btnNewButton_1.top = new FormAttachment(btnNewButton, 0, SWT.TOP);
        fd_btnNewButton_1.right = new FormAttachment(100,-10);
        btnNewButton_1.setLayoutData(fd_btnNewButton_1);
        str = options[ansCount][2];
        btnNewButton_1.setText(str);
        //handCursor = new Cursor(myDisplay,SWT.CURSOR_HAND);
        btnNewButton_1.setCursor(handCursor);
        
        btnNewButton_1.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event){
                if(myAnswers[2][num] == 1)
                {
                    score++;
                    clicked = 1;

                }
                myDisplay.dispose();

                
            }
        });
        
        
        
        
        
        Button btnNewButton_2 = new Button(myShell, SWT.CENTER);
        FormData fd_btnNewButton_2 = new FormData();
        fd_btnNewButton_2.bottom = new FormAttachment(qLabel, 0, SWT.BOTTOM);
        //fd_btnNewButton_2.right = new FormAttachment(btnNewButton, 0, SWT.RIGHT);
        fd_btnNewButton_2.left = new FormAttachment(btnNewButton, 0, SWT.LEFT);
        btnNewButton_2.setLayoutData(fd_btnNewButton_2);
        btnNewButton_2.setText(options[ansCount][3]);
        //handCursor = new Cursor(myDisplay,SWT.CURSOR_HAND);
        btnNewButton_2.setCursor(handCursor);
        btnNewButton_2.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event){
                if(myAnswers[3][num] == 1)
                {
                    score++;
                    clicked = 1;

                }
                myDisplay.dispose();

            }
        });
        
        
        
        
        
        
        Button btnNewButton_3 = new Button(myShell, SWT.CENTER);
        FormData fd_btnNewButton_3 = new FormData();
        //fd_btnNewButton_3.top = new FormAttachment(qLabel, -60, SWT.BOTTOM);
        fd_btnNewButton_3.bottom = new FormAttachment(qLabel, 0, SWT.BOTTOM);
        fd_btnNewButton_3.right = new FormAttachment(btnNewButton_1, 0, SWT.RIGHT);
        btnNewButton_3.setLayoutData(fd_btnNewButton_3);
        btnNewButton_3.setText(options[ansCount][4]);
        //Cursor handCursor = new Cursor(myDisplay,SWT.CURSOR_HAND);
        btnNewButton_3.setCursor(handCursor);
        
        btnNewButton_3.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event){
                if(myAnswers[4][num] == 1)
                {
                    score++;
                    clicked = 1;

                }
                myDisplay.dispose();

                
            }
        });
        
        
        
        
        Label label = new Label(myShell, SWT.NONE);
        label.setAlignment(SWT.CENTER);
        FormData fd_label = new FormData();
        fd_label.right = new FormAttachment(qLabel, 280, SWT.RIGHT);
        fd_label.left = new FormAttachment(qLabel, 6);
        fd_label.top = new FormAttachment(qLabel1, 0, SWT.TOP);
        label.setLayoutData(fd_label);
        label.setText("Options");
        
        
        
        Label lblHint = new Label(myShell, SWT.NONE);
        lblHint.setAlignment(SWT.CENTER);
        FormData fd_lblHint = new FormData();
        fd_lblHint.right = new FormAttachment(qLabel, 0, SWT.RIGHT);
        fd_lblHint.left = new FormAttachment(qLabel, 10, SWT.LEFT);
        fd_lblHint.top = new FormAttachment(qLabel, 6);
        lblHint.setLayoutData(fd_lblHint);
        lblHint.setText("Hint");
        
        Label lblNewLabel = new Label(myShell, SWT.BORDER);
        lblNewLabel.setAlignment(SWT.CENTER);
        FormData fd_lblNewLabel = new FormData();
        fd_lblNewLabel.bottom = new FormAttachment(100, -10);
        fd_lblNewLabel.top = new FormAttachment(lblHint, 6);
        fd_lblNewLabel.right = new FormAttachment(btnNewButton, 0, SWT.RIGHT);
        fd_lblNewLabel.left = new FormAttachment(0);
        lblNewLabel.setLayoutData(fd_lblNewLabel);
        lblNewLabel.setText("Hint Document\n\n¯\\_(ツ)_/¯");
        
        
        
        Button btnNewButton_4 = new Button(myShell, SWT.NONE);
        btnNewButton_4.setAlignment(SWT.RIGHT);
        FormData fd_btnNewButton_4 = new FormData();
        fd_btnNewButton_4.right = new FormAttachment(btnNewButton_1, 0, SWT.RIGHT);
        fd_btnNewButton_4.bottom = new FormAttachment(lblNewLabel, 77);
        fd_btnNewButton_4.top = new FormAttachment(lblNewLabel, 0, SWT.TOP);
        fd_btnNewButton_4.left = new FormAttachment(lblNewLabel, 17);
        btnNewButton_4.setLayoutData(fd_btnNewButton_4);
        btnNewButton_4.setText("Hint?");
        
        
        btnNewButton_4.setImage(scaledImage);
        //Cursor handCursor = new Cursor(myDisplay,SWT.CURSOR_HAND);
        btnNewButton_4.setCursor(handCursor);
        btnNewButton_4.addSelectionListener(new SelectionAdapter(){
            public void widgetSelected(SelectionEvent event1){
                lblNewLabel.setText(hints[num]);
            }
        });

        
        

        //System.out.print("Reached");
        
      /*  myShell.open();
        myDisplay.sleep();
////////        myDisplay.dispose();

        
        if(clicked == 1){
            clicked = 0;
            ansCount++;
            System.out.print("Clicked");

            myDisplay.dispose();
            continue;

        }
        
        */
        
        System.out.println("Score="+score);

        
     myShell.open();
        while (!myShell.isDisposed()) {
            if (!myDisplay.readAndDispatch()) myDisplay.sleep();
         }
        myDisplay.dispose();

 /*       
        while(myShell.isDisposed() || clicked==1){
            ansCount++;  
                   clicked = 0;
                   myDisplay.dispose();
            break;  

        }
        continue;
         //myDisplay.dispose();
        
 */
         
        }

        System.out.printf("Score==%d",score);

    }
}