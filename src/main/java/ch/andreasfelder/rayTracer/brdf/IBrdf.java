package ch.andreasfelder.rayTracer.brdf;

import ch.andreasfelder.vector.Vector3;

public interface IBrdf {
    public Vector3 calculate(Vector3 diffuseColour, Vector3 d, Vector3 n, Vector3 omega_r);
}
