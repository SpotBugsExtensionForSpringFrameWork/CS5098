package com.cs5098sbext.badpractice;

import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify if @Enumerated(EnumType.ORDINAL) is used
 * in JPA. This causes inflexibility for database column type.
 *
 * More learn...
 * https://www.baeldung.com/jpa-persisting-enums-in-jpa#ordinal
 * https://stackoverflow.com/questions/6789342/jpa-enum-ordinal-vs-string
 *
 * @author Yoo Chul Kim
 */
public class ChangeableEnumsPersistenceDetector implements Detector {
    public ChangeableEnumsPersistenceDetector() {

    }

    @Override
    public void visitClassContext(ClassContext classContext) {

    }

    @Override
    public void report() {

    }
}
