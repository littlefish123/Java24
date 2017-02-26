/* http://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html */

/* A Strategy for Defining Immutable Objects   */
/*
    Don't provide "setter" methods � methods that modify fields or objects referred to by fields.
    Make all fields final and private.
    Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final. A more sophisticated approach is to make the constructor private and construct instances in factory methods.
    If the instance fields include references to mutable objects, don't allow those objects to be changed:
        Don't provide methods that modify the mutable objects.
        Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
*/        



package multithread.immutableObject;

public class ImmutableRGB {

}
