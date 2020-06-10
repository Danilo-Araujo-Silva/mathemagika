package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FilledCurve
 * 
 * Full name:        System`FilledCurve
 * 
 *                   FilledCurve[{segment , segment , …}] represents a filled curve consisting of segment  followed by segment  etc. 
 *                                       1         2                                                     1                    2
 *                   FilledCurve[{component , component , …}] represents a list of separate filled component curves component , component , etc. 
 * Usage:                                  1           2                                                                     1           2
 * 
 *                   Method -> Automatic
 * Options:          VertexTextureCoordinates -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FilledCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/FilledCurve.html
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
fun filledCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FilledCurve", arguments.toMutableList(), options)
}
