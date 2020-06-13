package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DescriptorStateSpace
 *
 * Full name:        System`DescriptorStateSpace
 *
 * Usage:            DescriptorStateSpace is an option to StateSpaceModel and StateSpaceTransform that specifies whether to use descriptor or standard representation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DescriptorStateSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/DescriptorStateSpace.html
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
fun descriptorStateSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DescriptorStateSpace", arguments.toMutableList(), options)
}
