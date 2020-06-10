package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PatternFilling
 * 
 * Full name:        System`PatternFilling
 * 
 *                   PatternFilling[obj] is a two-dimensional graphics directive specifying that obj should be used to fill faces of polygons and other filled graphics objects.
 *                   PatternFilling["name"] uses the specified pattern "name".
 *                   PatternFilling[obj, size] specifies the size of the object obj.
 * Usage:            PatternFilling[obj, size, {dx, dy}] moves the object obj by the offset {dx, dy}.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PatternFilling
 * Documentation:    web: http://reference.wolfram.com/language/ref/PatternFilling.html
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
fun patternFilling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PatternFilling", arguments.toMutableList(), options)
}
