package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateSearchIndex
 *
 * Full name:        System`CreateSearchIndex
 *
 *                   CreateSearchIndex[dir] creates a search index from all files in the directory dir and its subdirectories.
 *                   CreateSearchIndex[{source , source , …}] creates a search index from all sources source .
 *                                            1        2                                                    i
 *                   CreateSearchIndex[sources, "name"] gives the search index the specified name.
 * Usage:            CreateSearchIndex[] creates an empty search index, which can be added to with AddToSearchIndex.
 *
 *                   ContentFieldOptions -> <||>
 *                   ContentLocationFunction -> Automatic
 *                   DocumentWeightingRules -> None
 *                   Language -> Automatic
 *                   Method -> BM25
 *                   OverwriteTarget -> False
 * Options:          TextSearch`DocumentWeightingFunction -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateSearchIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateSearchIndex.html
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
fun createSearchIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateSearchIndex", arguments.toMutableList(), options)
}
