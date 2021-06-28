package day_57_abstraction_polymorhism.abstract_class_vs_interface;

import java.io.Serializable;

/**
 * Interface can extend multiple other interfaces . interfaces support multi inheritance
 * When it extends another interface, child interface is not responsible to override any methods
 * Concrete sub classes will be responsible for overriding all abstract methods
 */
public interface InterfaceB extends InterfaceA, Serializable, Cloneable {

}
