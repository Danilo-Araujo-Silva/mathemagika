package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Inset
 *
 * Full name:        System`Inset
 *
 *                   Inset[obj] represents an object obj inset in a graphic.
 *                   Inset[obj, pos] specifies that the inset should be placed at position pos in the graphic.
 *                   Inset[obj, pos, opos] aligns the inset so that position opos in the object lies at position pos in the enclosing graphic.
 *                   Inset[obj, pos, opos, size] specifies the size of the inset in the coordinate system of the enclosing graphic.
 * Usage:            Inset[obj, pos, opos, size, dirs] specifies that the axes of the inset should be oriented in directions dirs.
 *
 *                   Alignment -> Left
 *                   Background -> None
 *                   BaseStyle -> Inset
 *                   ContentSelectable -> Automatic
 * Options:          FormatType -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Inset
 * Documentation:    web: http://reference.wolfram.com/language/ref/Inset.html
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
fun inset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Inset", arguments.toMutableList(), options)
}
