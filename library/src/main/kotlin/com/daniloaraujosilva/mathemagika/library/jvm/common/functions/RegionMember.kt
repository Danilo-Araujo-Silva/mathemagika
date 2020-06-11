package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionMember
 *
 * Full name:        System`RegionMember
 *
 *                   RegionMember[reg, {x, y, …}] gives True if the numeric point {x, y, …} is a member of the constant region reg and False otherwise.
 *                   RegionMember[reg, {x, y, …}] gives conditions for the point {x, y, …} to be a member of reg.
 * Usage:            RegionMember[reg] returns a RegionMemberFunction[…] that can be applied repeatedly to different points.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RegionMember
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionMember.html
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
fun regionMember(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionMember", arguments.toMutableList(), options)
}
