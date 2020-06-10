package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Span
 * 
 * Full name:        System`Span
 * 
 *                   i;;j represents a span of elements i through j.
 *                   i;; represents a span from i to the end.
 *                   ;;j represents a span from the beginning to j.
 *                   ;; represents a span that includes all elements.
 *                   i;;j;;k represents a span from i through j in steps of k.
 *                   i;;;;k represents a span from i to the end in steps of k.
 *                   ;;j;;k represents a span from the beginning to j in steps of k.
 * Usage:            ;;;;k represents a span from the beginning to the end in steps of k. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Span
 * Documentation:    web: http://reference.wolfram.com/language/ref/Span.html
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
fun span(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Span", arguments.toMutableList(), options)
}
