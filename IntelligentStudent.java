public class IntelligentStudent extends Student{
    private int iq;
    private int intelligentScore;

    IntelligentStudent(){

    }
    IntelligentStudent(IntelligentStudent is){
        //initialize the parent attributes
        super(is);
        this.intelligentScore = is.intelligentScore;
        this.iq = is.iq;
    }
    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIntelligentScore() {
        return intelligentScore;
    }

    public void setIntelligentScore(int intelligentScore) {
        this.intelligentScore = intelligentScore;
    }
}
/*
Shallow copy
st
stCopy

 */