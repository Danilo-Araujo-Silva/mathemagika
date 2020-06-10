package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Annotate
 * 
 * Full name:        System`Annotate
 * 
 *                   Annotate[obj, key  value] sets the annotation key  value for the object obj.
 * Usage:            Annotate[{obj, itemspec}, key  value] sets the annotation for the items in obj specified by itemspec.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Annotate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Annotate.html
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
fun annotate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Annotate", arguments.toMutableList(), options)
}
