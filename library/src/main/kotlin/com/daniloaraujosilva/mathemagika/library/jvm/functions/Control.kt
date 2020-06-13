package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Control
 *
 * Full name:        System`Control
 *
 *                   Control[{u, dom}] represents an interactive control for the variable u in the domain dom, with the type of control chosen to be appropriate for the domain specified.
 *                   Control[{{u, u    }, dom}] represents a control with initial value u    .
 * Usage:                          init                                                  init
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Control
 * Documentation:    web: http://reference.wolfram.com/language/ref/Control.html
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
fun control(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Control", arguments.toMutableList(), options)
}
