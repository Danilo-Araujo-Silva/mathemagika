package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SocialMediaData
 *
 * Full name:        System`SocialMediaData
 *
 *                   SocialMediaData["name"] gives information about the social media entity "name".
 *                   SocialMediaData["name", "property"] gives the value of the specified property for the social media entity "name".
 * Usage:            SocialMediaData[{"name", id}, "property"] gives the value of a property for the specified identifier id.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SocialMediaData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SocialMediaData.html
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
fun socialMediaData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SocialMediaData", arguments.toMutableList(), options)
}
