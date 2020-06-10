package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Thumbnail
 * 
 * Full name:        System`Thumbnail
 * 
 *                   Thumbnail[image] gives a thumbnail version of an image.
 *                   Thumbnail[file] gives a thumbnail of an image stored in a file.
 *                   Thumbnail[url] gives a thumbnail of an image stored at a URL.
 * Usage:            Thumbnail[spec, size] gives a thumbnail with the specified maximum pixel size.
 * 
 *                   Background -> Automatic
 *                   IncludeMetaInformation -> All
 * Options:          Padding -> Fixed
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Thumbnail
 * Documentation:    web: http://reference.wolfram.com/language/ref/Thumbnail.html
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
fun thumbnail(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Thumbnail", arguments.toMutableList(), options)
}
