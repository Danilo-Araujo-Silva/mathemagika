package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WikidataData
 * 
 * Full name:        System`WikidataData
 * 
 *                   WikidataData[item, property] gives the values of the specified property for the given item.
 *                   WikidataData[{item , item , …}, property] gives values for each of the item .
 *                                     1      2                                                 i
 *                   WikidataData[item, {property , property , …}] gives values for each of the property .
 *                                               1          2                                           i
 * Usage:            WikidataData[items, properties] gives values for each of the properties for each of the items.
 * 
 *                   Language :> $Language
 *                   Method -> Automatic
 * Options:          SPARQLEndpoint -> https://query.wikidata.org/sparql
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WikidataData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WikidataData.html
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
fun wikidataData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WikidataData", arguments.toMutableList(), options)
}
