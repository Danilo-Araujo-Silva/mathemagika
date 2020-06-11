package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CentralFeature
 *
 * Full name:        System`CentralFeature
 *
 *                   CentralFeature[{x , x , …}] gives the central feature of the elements x .
 *                                    1   2                                                 i
 *                   CentralFeature[{x   v , x   v , …}] gives the v  corresponding to the central feature x .
 *                                    1    1   2    2                 i                                       i
 * Usage:            CentralFeature[data] gives the central feature for several different forms of data.
 *
 * Options:          DistanceFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CentralFeature
 * Documentation:    web: http://reference.wolfram.com/language/ref/CentralFeature.html
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
fun centralFeature(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CentralFeature", arguments.toMutableList(), options)
}
