package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HatchFilling
 *
 * Full name:        System`HatchFilling
 *
 *                   HatchFilling[] is a two-dimensional graphics directive that specifies that faces of polygons and other filled graphics objects are to be drawn using closely spaced parallel lines.
 *                   HatchFilling["name"] uses the specified line hatching "name".
 *                   HatchFilling[θ] draws parallel lines with an angle θ.
 *                   HatchFilling[θ, r] draws parallel lines with absolute thickness r.
 * Usage:            HatchFilling[θ, r, d] draws parallel lines with gaps of absolute thickness d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HatchFilling
 * Documentation:    web: http://reference.wolfram.com/language/ref/HatchFilling.html
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
fun hatchFilling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HatchFilling", arguments.toMutableList(), options)
}
