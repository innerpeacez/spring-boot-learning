package com.zhw.study.springbootannotation;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ReflectionUtils;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Set;

@TransactionalService(name = "test")
public class TransactionalServiceAnnotationMetadataBootstrap {

    public static void main(String[] args) throws IOException {
//        // @TransactionalService 标注在当前类 TransactionalServiceAnnotationMetadataBootstrap
//        String className = TransactionalServiceAnnotationMetadataBootstrap.class.getName();
//        // 构建 MetadataReaderFactory 实例
//        MetadataReaderFactory metadataReaderFactory = new CachingMetadataReaderFactory();
//        // 读取 @TransactionService MetadataReader 信息
//        MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(className);
//        // 读取 @TransactionService AnnotationMetadata 信息
//        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//
//        annotationMetadata.getAnnotationTypes().forEach(annotationType -> {
//
//            Set<String> metaAnnotationTypes = annotationMetadata.getMetaAnnotationTypes(annotationType);
//
//            metaAnnotationTypes.forEach(metaAnnotationType -> {
//                System.out.printf("注解 @%s 元标注 @%s\n", annotationType, metaAnnotationType);
//            });
//
//        });


        // 反射
        AnnotatedElement element = TransactionalServiceAnnotationMetadataBootstrap.class;
        TransactionalService transactionalService = element.getAnnotation(TransactionalService.class);
        String name = transactionalService.name();
//        System.out.printf("TransactionalService.name()=%s", name);
        ReflectionUtils.doWithMethods(TransactionalService.class,
                method -> System.out.printf("TransactionalService.name()=%s\n",
                        ReflectionUtils.invokeMethod(method, transactionalService),
                        method.getName()), method -> !method.getDeclaringClass().equals(Annotation.class));

    }
}