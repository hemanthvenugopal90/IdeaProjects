package CoreJava.FinalFinalizeFinallyConcept;

public class FinalizeConcept {

    public void finalize(){ //Finalize is a method
        System.out.println("Finalize method"); //We are not calling this finalize method. Automatically it will be called. First it will go to main method and f1,f2, system.gc()
        // Will be called. The Finalized method will be called to do some Clean up Processing for the object just before the object f1,f2 is Garbage collected in the main method
    }   // Finalized keyword is used for Clean up processing before the Garbage collector processing.

    public static void main(String[] args) {
        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();

        f1 = null;
        f2 = null;

        System.gc();//In java, garbage means unreferenced objects. Garbage Collection is process of reclaiming the runtime unused memory automatically.
                    // In other words, it is a way to destroy the unused objects.
    }
}
