package cn.hutool.extra.expression.engine.aviator;

import cn.hutool.extra.expression.ExpressionEngine;
import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;

import java.util.Map;

/**
 * Aviator引擎封装<br>
 * 见：<a href="https://github.com/killme2008/aviatorscript">https://github.com/killme2008/aviatorscript</a>
 *
 * @author looly
 * @since 5.5.0
 */
public class AviatorEngine implements ExpressionEngine {

	private final AviatorEvaluatorInstance engine;

	/**
	 * 构造
	 */
	public AviatorEngine() {
		engine = AviatorEvaluator.getInstance();
	}

	@Override
	public Object eval(final String expression, final Map<String, Object> context) {
		return engine.execute(expression, context);
	}

	/**
	 * 获取{@link AviatorEvaluatorInstance}
	 *
	 * @return {@link AviatorEvaluatorInstance}
	 */
	public AviatorEvaluatorInstance getEngine() {
		return this.engine;
	}
}
