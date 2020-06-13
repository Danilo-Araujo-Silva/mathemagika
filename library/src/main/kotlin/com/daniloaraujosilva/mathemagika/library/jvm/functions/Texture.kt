package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Texture
 *
 * Full name:        System`Texture
 *
 * Usage:            Texture[obj] is a graphics directive that specifies that obj should be used as a texture on faces of polygons and other filled graphics objects.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Texture
 * Documentation:    web: http://reference.wolfram.com/language/ref/Texture.html
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
fun texture(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Texture", arguments.toMutableList(), options)
}
