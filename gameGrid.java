//Evaan J 
//Feb 7
//Final project - The Game of Life

public class gameGrid extends matrix {
    
    public static int w = 0;
    public static boolean [][] cor2 = new boolean [0][0];
    
    //Creating a void that will intake data
    public void data (int data){
        
        //Setting the value of data equal to user
        user = data;
        
    }
    public void rowInput(){

        //Setting the value of one int equal to another
        rowValue = user;
      
    }
    public void columnInput (){
        
        colValue = user;
        create ();

    }
   
    public void numOrganism(){
        
        numValue = user;
        
    }
    public void gen(){
        
        this.genValue = user;
        
    }
    public void lead (){
        
        //k is a counter variable that counts how many generations ahve been printed
        if(k<this.genValue && k>=1){
   
            System.out.println("hello");
            nextGen();
            print();
            k++;
            
        }else if(k==0){
            
            print();
            k++;
        }
        else if(k>= genValue){
            print.setVisible(false);
            end.setVisible(true);
        }
    
    }
    public void rowUpdate (){
                                              
        rowUpdate = user ; 
        
    }
    public void colUpdate (){
        
        colUpdate = user;
        cellUpdate();
        
    }
    public void cellUpdate(){
        
        cor1[rowUpdate][colUpdate] = true;
        w++;
        System.out.println(w);

          
    }
    public void nextGen(){
        
        cor2 = new boolean [rowValue][colValue]; 
        cor2 = cor1;
        
        int h=0;
        
        //Creating a for loop that will loop code a certain number of times
        for(int p=0; p<rowValue ; p++){
            for(int k=0; k<colValue ; k++){
                for(int j=-1+p; j<2+p; j++){
                    for(int i=-1+k; i<2+k; i++){
                        
                        //Using try catch to catch places where the code might fail; where the code is called to check 
                        //the negative direction of the 2d array
                        try{
                            if (cor1[j][i]){
                                h++;
                            }
                        }catch(Exception e){
                            
                        }
                    }  
                } 

                if (cor1[p][k] && h==4){
                    //Setting a cell in the array to true 
                    cor2[p][k]=true;
                }else if (cor1[p][k] && h<3){
                    ////Setting a cell in the array to true 
                    cor2[p][k]=false;
                }else if (cor1[p][k] && h>4){
                    cor2[p][k]=false;
                }else if (!cor1[p][k] && h==3){
                    cor2[p][k]=true;
                }else if (!cor1[p][k] && h<2){
                    cor2[p][k]=false;
                }else if (!cor1[p][k] && h>3){
                    cor2[p][k]=false;
                }
                h=0;
                
            }
        }
        
        cor1 = cor2;
        for (int i = 0; i < cor2.length;i++){
            for (int j= 0; j<cor2[0].length; j++){
                System.out.println(cor2[i][j]+ " ");
                         
            }System.out.println();
               
        }
        
    } 
    public void print (){
        
        //Creating a StringBuilder that will take multiple inputs to create a string
        StringBuilder s = new StringBuilder ();
        
        for(int w=0; w<rowValue ; w++){
            for(int j=0; j<colValue ; j++){

                //Printing out the column values of row "w"
                if(cor1 [w][j]){
                    s.append("*     ");
                }else {
                    s.append(".     ");
                }
            }
            s.append("\n");
        }
        
        //Setting the StringBuilder equivilent to a String
        String array = s.toString();
        
        print.print(array);
        print.setVisible(true);
    }
    public void forward (){
        
        int j = 0;
        
        gameGrid.lead();
        j++;
        
        if(j>genValue){
            print.setVisible(false);
            
            
        }
    }


    
}
