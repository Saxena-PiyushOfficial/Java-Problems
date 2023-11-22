
package subject;


public class Subject {

    

 private String subID;
 private String name;
 private int maxMarks;
 private int marksObtains;
 public Subject(String subID,String name,int maxMarks,int marksObtains)
 {
     this.subID=subID;
     this.name=name;
     this.maxMarks=maxMarks;
     this.marksObtains=marksObtains;
 }
 public String getsubID()
 {
     return subID;
 }
 public String getname()
 {
     return name;
 }
 public int getmarksObtains()
 {
     return marksObtains;
 }
 public int getmaxMarks()
 {
     return maxMarks;
 }
 public void setmaxMarks(int mm)
 {
     maxMarks=mm;
 }
 public void setmarksObtains(int m)
 {
     maxMarks=m;
 }
 boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }

    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        
       
        subs[0]=new Subject("s101","DS",100,67);
        subs[1]=new Subject("s102","Algorithms",100,89);
        subs[2]=new Subject("s103","Operating Systems",100,99);
        for(Subject s:subs)
            System.out.println(s);
        
     }
}
    

