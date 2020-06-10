package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DiskMatrix
 * 
 * Full name:        System`DiskMatrix
 * 
 *                   DiskMatrix[r] gives a matrix whose elements are 1 in a disk-shaped region of radius r, and are otherwise 0.
 *                   DiskMatrix[r, w] gives a w × w matrix containing a disk of 1s with radius r.
 *                                                                                                                                      th
 *                   DiskMatrix[{r , r , …}, …] yields an array whose elements are 1 in an ellipsoidal region with semiaxis r  in the i   index direction.
 * Usage:                         1   2                                                                                      i
 * 
 * Options:          DistanceFunction -> EuclideanDistance
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DiskMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiskMatrix.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun diskMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiskMatrix", arguments.toMutableList(), options)
}
