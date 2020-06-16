package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FeatureExtract
 *
 * Full name:        System`FeatureExtract
 *
 *                   FeatureExtract[{example , example , …}] extracts features for each of the example  using a feature extractor trained on all the example .
 *                                          1         2                                               i                                                     i
 *                   FeatureExtract[examples, extractor] extracts features using the specified feature extractor method.
 *                   FeatureExtract[examples, {extractor , extractor , …}] extracts features by applying the extractor  in sequence.
 *                                                      1           2                                                 i
 *                   FeatureExtract[examples, spec  ext] uses the extractor methods specified by ext on parts of examples specified by spec.
 *                   FeatureExtract[examples, {spec   ext , spec   ext , …}] uses the extractor methods ext  on parts of examples specified by the spec .
 * Usage:                                          1      1      2      2                                    i                                           i
 *
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   NominalVariables -> Automatic
 *                   OutputWrapper -> List
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeatureExtract
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureExtract.html
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
fun featureExtract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureExtract", arguments.toMutableList(), options)
}
