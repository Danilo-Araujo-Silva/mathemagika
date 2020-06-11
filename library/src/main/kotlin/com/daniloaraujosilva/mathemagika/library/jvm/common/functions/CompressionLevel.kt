package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompressionLevel
 *
 * Full name:        System`CompressionLevel
 *
 * Usage:            CompressionLevel is an option for Export and CreateArchive that specifies the amount of compression to use when compressing data.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompressionLevel
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompressionLevel.html
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
fun compressionLevel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompressionLevel", arguments.toMutableList(), options)
}
