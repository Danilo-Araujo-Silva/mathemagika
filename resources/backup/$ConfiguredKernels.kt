package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             8 local kernels
 *
 * Full name:        Information[8 local kernels][FullName]
 *
 * Usage:            {Information[8 local kernels][Usage]}
 *
 * Options:          Information[8 local kernels][Options]
 *
 * Attributes:       Information[8 local kernels][Attributes]
 *
 *                   local: <>{Information[8 local kernels][Documentation]}[Local]
 * Documentation:    web: <>{Information[8 local kernels][Documentation]}[Web]
 *
 * Definitions:      Information[8 local kernels][Definitions]
 *
 * Own values:       Information[8 local kernels][OwnValues]
 *
 * Down values:      Information[8 local kernels][DownValues]
 *
 * Up values:        Information[8 local kernels][UpValues]
 *
 * Sub values:       Information[8 local kernels][SubValues]
 *
 * Default value:    Information[8 local kernels][DefaultValues]
 *
 * Numeric values:   Information[8 local kernels][NValues]
 */
fun `$ConfiguredKernels`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ConfiguredKernels", arguments.toMutableList(), options)
}
