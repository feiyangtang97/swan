package de.fraunhofer.iem.mois.features;

import de.fraunhofer.iem.mois.IFeature;
import de.fraunhofer.iem.mois.data.Method;

/**
 * Common class for all features that have to do with the method name
 *
 * @author Siegfried Rasthofer
 *
 */
public class MethodNameEndsWithFeature implements IFeature {

  private final String endsWith;

  public MethodNameEndsWithFeature(String endsWith) {
    this.endsWith = endsWith;
  }

  @Override
  public Type applies(Method method) {
    String methodNameLowerCase = method.getMethodName().toLowerCase();
    String endsWithLowerCase = endsWith.toLowerCase();
    return (methodNameLowerCase.endsWith(endsWithLowerCase) ? Type.TRUE
        : Type.FALSE);
  }

  @Override
  public String toString() {
    return "<Method name ends with " + this.endsWith + ">";
  }

}
