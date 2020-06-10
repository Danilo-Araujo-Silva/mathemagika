package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LocalCache
 * 
 * Full name:        System`LocalCache
 * 
 *                   LocalCache[CloudObject[uri]] caches a cloud object in a local object.
 *                   LocalCache[URL[url]] caches the contents of a url in a local object.
 * Usage:            LocalCache[obj, LocalObject[name]] caches the contents of obj in the specified local object.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LocalCache
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalCache.html
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
fun localCache(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalCache", arguments.toMutableList(), options)
}
