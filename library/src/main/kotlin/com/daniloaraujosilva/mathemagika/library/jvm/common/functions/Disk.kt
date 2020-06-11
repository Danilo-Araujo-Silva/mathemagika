package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Disk
 *
 * Full name:        System`Disk
 *
 *                   Disk[{x, y}, r] represents a disk of radius r centered at {x, y}.
 *                   Disk[{x, y}] gives a disk of radius 1.
 *                   Disk[{x, y}, {r , r }] gives an axis-aligned elliptical disk with semiaxes lengths r  and r .
 *                                  x   y                                                                x      y
 *                   Disk[{x, y}, …, {θ , θ }] gives a sector of a disk from angle θ  to θ .
 * Usage:                              1   2                                        1     2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Disk
 * Documentation:    web: http://reference.wolfram.com/language/ref/Disk.html
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
fun disk(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Disk", arguments.toMutableList(), options)
}
