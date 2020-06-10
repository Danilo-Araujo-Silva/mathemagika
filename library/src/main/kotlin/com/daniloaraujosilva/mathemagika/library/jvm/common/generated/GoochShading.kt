package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GoochShading
 * 
 * Full name:        System`GoochShading
 * 
 *                   GoochShading[] is a three-dimensional graphics directive specifying that surfaces that follow are to be drawn with a warm color facing toward the light and a cool color facing away.
 *                   GoochShading[col] uses cool and warm colors obtained by blending col with slate Blue and Orange.
 *                   GoochShading[{ccol, wcol}] uses the cool color ccol and the warm color wcol.
 *                   GoochShading[{w , w }  {ccol, wcol}] uses the colors ccol and wcol weighted by the w .
 *                                  1   2                                                                 i
 * Usage:            GoochShading["scheme"] uses the specified gradient color scheme in ColorData.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GoochShading
 * Documentation:    web: http://reference.wolfram.com/language/ref/GoochShading.html
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
fun goochShading(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GoochShading", arguments.toMutableList(), options)
}
